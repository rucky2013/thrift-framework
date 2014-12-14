/*
 * Copyright 2005-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Author:	Simon.Hoo
 * Blog:   	http://www.cottsoft.com 
 * Email:	Info@cottsoft.com
 * 
 * You can @simonhoo  on Github.com, weibo.com, twitter, t.qq.com
 */

package com.cottsoft.thrift.framework.exception;

/**
 * Description：<br> 
 * Thrift 自定义异常
 * @author  Simon.Hoo(Info@cottsoft.com)
 * @date    2013年06月13日
 * @version v1.0.0
 */
public class ThriftException extends Exception {
	private static final long serialVersionUID = -5274946244705035514L;

	public ThriftException() {
		super();
	}

	public ThriftException(String message, Throwable cause) {
		super(message, cause);
	}

	public ThriftException(String message) {
		super(message);
	}

	public ThriftException(Throwable cause) {
		super(cause);
	}
}

