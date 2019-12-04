var exec = require('cordova/exec');
/**
 * 设置登录信息
 * @param mVpnAddress vpn地址ip
 * @param mVpnPort vpn地址对应的端口
 * @param mUserName vpn用户名
 * @param mUserPassword vpn密码
 */
exports.setLoginInfo = function (mVpnAddress,mVpnPort,mUserName,mUserPassword, success, error) {
    exec(success, error, 'sangforvpn', 'setLoginInfo', [mVpnAddress,mVpnPort,mUserName,mUserPassword]);
};

/**
 * 启动vpn 初始化并登录
 */
exports.startVPNInitAndLogin = function (success, error) {
    exec(success, error, 'sangforvpn', 'startVPNInitAndLogin', []);
};


