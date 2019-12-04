package cn.com.ths.sangfor.vpn;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class sangforvpn extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        // 设置登录信息
        if (action.equals("setLoginInfo")) {
            String message = args.getString(0);
            this.setLoginInfo(message, callbackContext);
            return true;
        // 启动VPN 并初始化登录
        }else if(action.equals("startVPNInitAndLogin")){

            return true;
        }
        return false;
    }

    private void setLoginInfo(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
