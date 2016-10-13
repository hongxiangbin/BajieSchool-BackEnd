package com.zlfinfo.test;

import com.zlfinfo.util.MathToolkit;
import org.junit.Test;

/**
 * Created by 29140 on 2016/10/13.
 */
public class MathToolkitTest {

    @Test
    public void testGenerateCaptcha() {
        System.out.println(MathToolkit.generateCaptcha());
    }
}
