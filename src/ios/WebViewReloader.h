#import <UIKit/UIKit.h>
#import <Cordova/CDV.h>

@interface WebViewReloader : CDVPlugin

- (void)reload:(CDVInvokedUrlCommand*)command;

@end