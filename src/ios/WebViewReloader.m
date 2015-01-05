#import "WebViewReloader.h"
#import "AppDelegate.h"
#import <Cordova/CDV.h>

@implementation WebViewReloader

- (void)reload:(CDVInvokedUrlCommand*)command
{           
    AppDelegate* appDelegate = [[UIApplication sharedApplication] delegate];
    CDVViewController* topview = appDelegate.viewController;
    
    NSString* path = [[NSBundle mainBundle] pathForResource:@"www/index" ofType:@"html"];
    NSURL* url = [NSURL fileURLWithPath:path];
    NSURLRequest* request = [NSURLRequest requestWithURL: url];
    
    [topview.webView loadRequest:request];
}

@end