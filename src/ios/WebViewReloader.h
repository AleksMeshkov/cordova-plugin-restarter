#import <UIKit/UIKit.h>
#import <Cordova/CDV.h>

@interface Restarter : CDVPlugin

- (void)reload:(CDVInvokedUrlCommand*)command;

@end