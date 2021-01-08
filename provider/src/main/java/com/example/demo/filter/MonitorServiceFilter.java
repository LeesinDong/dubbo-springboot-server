package com.example.demo.filter;

import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;

import java.util.Map;

/**
 * @author Leesin Dong
 * @date Created in 2021/1/8 11:06 上午
 */

@Activate()
public class MonitorServiceFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("filter=============");
        String methodName = invocation.getMethodName();
        System.out.println("methodName:" + methodName);

        Class<?>[] parameterTypes = invocation.getParameterTypes();
        for (Class<?> parameterType : parameterTypes) {
            System.out.println("parameterTypes:" + parameterType.getName());
        }

        Object[] arguments = invocation.getArguments();
        for (Object argument : arguments) {
            System.out.println("argument:" + argument);
        }

        Map<String, String> attachments = invocation.getAttachments();
        attachments.forEach((key, value) -> {
            System.out.println(key + " " + value );
        });

        return invoker.invoke(invocation);
    }
}
