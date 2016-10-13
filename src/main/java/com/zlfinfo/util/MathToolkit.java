package com.zlfinfo.util;

/**
 * Created by 29140 on 2016/10/13.
 * <p>
 * 系统中用到的数学工具包
 *
 * @author LucasX
 */
public class MathToolkit {

    /**
     * 验证码生成
     *
     * @return
     */
    public static String generateCaptcha() {
        char[] lowCaseAlpha = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] num = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        char char1 = lowCaseAlpha[(int) (Math.random() * lowCaseAlpha.length)];
        char char2 = lowCaseAlpha[(int) (Math.random() * lowCaseAlpha.length)];
        char char3 = num[(int) (Math.random() * num.length)];
        char char4 = num[(int) (Math.random() * num.length)];

        return String.valueOf(char1 + "" + char2 + char3 + char4);

    }
}
