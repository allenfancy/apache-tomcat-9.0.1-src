/*
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
 */
package org.apache.tomcat.util.net;

import java.nio.ByteBuffer;

/**
 * Callback interface to be able to expand buffers when buffer overflow
 * exceptions happen or to replace buffers
 * 回调接口能够扩大缓冲缓冲区溢出发生异常或替换缓冲区
 */
public interface ApplicationBufferHandler {

	/**
	 * @Desc  设置ByteBuffer
	 * @param buffer
	 */
    public void setByteBuffer(ByteBuffer buffer);

    /**
     * @Desc 获取ByteBuffer
     * @return
     */
    public ByteBuffer getByteBuffer();

    /**
     * @Desc 扩大内存
     * @param size
     */
    public void expand(int size);

}