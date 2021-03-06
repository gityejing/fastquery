/*
 * Copyright (c) 2016-2017, fastquery.org and/or its affiliates. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * For more information, please see http://www.fastquery.org/.
 * 
 */

package org.fastquery.test;

import org.objectweb.asm.util.ASMifier;

/**
 * 
 * @author mei.sir@aliyun.cn
 */
public class TestASMifier {

	public static void main(String[] args) throws Exception {
		// "Hi.class" 对应的字节码通过ASM工具怎样一步一步生成出来呢? 通过调用ASMifier.main, 可以得到通过ASM工具生成bytes的详细源码.
		// 解释太绕了, 运行一下便知
		ASMifier.main(new String[]{ "/mywork/myosgi/osgi_workspace/fastquery/target/test-classes/org/fastquery/bean/StudentDBServiceProxyImpl.class"} );
	}
}
