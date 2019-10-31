/*
 * Copyright (c) 2019-2029, xkcoding & Yangkai.Shen & 沈扬凯 (237497819@qq.com & xkcoding.com).
 * <p>
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE 3.0;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl.html
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xkcoding.magic.id.support.factory;

import com.xkcoding.magic.id.support.id.Id;

/**
 * <p>
 * 主键生成器工厂接口
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/10/29 16:46
 */
public interface IdFactory {
	/**
	 * 返回一个主键生成器对象
	 *
	 * @return 主键生成器
	 */
	Id getInstance();
}