package com.malex.cordova.plugin;

import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaActivity;

public class WebViewReloader extends CordovaPlugin {

    private final static String ACTION_RELOAD = "reload";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        final CallbackContext ctxt = callbackContext;

        if (action.equals(ACTION_RELOAD)) {
            final CordovaActivity act = (CordovaActivity)cordova.getActivity();
            act.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    act.loadUrl("file:///android_asset/www/index.html");
                    Log.d("WebViewReloader", "called by ui thread");
                    ctxt.success("reload successfull");
                }
            });

            return true;
        }

        callbackContext.error("Wrong action " + action + args);
        return false;
    }
}
