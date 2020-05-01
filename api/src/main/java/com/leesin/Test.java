// package com.leesin;
//
// /**
//  * @description:
//  * @author: Leesin Dong
//  * @date: Created in 2020/4/30 23:50
//  * @modified By:
//  */
// public class Test {
//     public Object invokeMethod(Object o, String n, Class[] p, Object[] v) throws java.lang.reflect.InvocationTargetException {
//         com.leesin.ISayHelloService w;
//         try {
//             w = ((com.leesin.ISayHelloService) $1);
//         } catch (Throwable e) {
//             throw new IllegalArgumentException(e);
//         }
//         try {
//             if ("sayByeBye".equals($2) && $3.length == 1) {
//                 return ($w) w.sayByeBye((java.lang.String) $4[0]);
//             }
//             if ("sayHello".equals($2) && $3.length == 0) {
//                 return ($w) w.sayHello();
//             }
//         } catch (Throwable e) {
//             throw new java.lang.reflect.InvocationTargetException(e);
//         }
//         throw new org.apache.dubbo.common.bytecode.NoSuchMethodException("Not found method \"" + $2 + "\" in class com.leesin.ISayHelloService.");
//     }
// }
