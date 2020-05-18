package com.learn.lambda;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.amazonaws.services.lambda.runtime.Context;


/**
 * @author wangpei
 * @date 2020/5/11 21:29
 * @description
 */
public class FunctionTest {

    public static void caculateValue(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        outputStream.write("hello,i'm test1".getBytes());
    }
}
