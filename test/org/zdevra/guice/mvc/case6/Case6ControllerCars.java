/*****************************************************************************
 * Copyright 2011 Zdenko Vrabel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 *****************************************************************************/
package org.zdevra.guice.mvc.case6;

import org.zdevra.guice.mvc.annotations.Controller;
import org.zdevra.guice.mvc.annotations.RequestMapping;
import org.zdevra.guice.mvc.annotations.ToView;

@Controller
@ToView("cars.jsp")
public class Case6ControllerCars {

	@RequestMapping(path="/common", nameOfResult="msg2")
	public String commonMethod() {
		return "cars common";
	}
		
	@RequestMapping(path="/cars", nameOfResult="msg1")
	public String carsMethod() {
		return "cars method";
	}

}
