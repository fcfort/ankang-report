/**
 **Copyright (c) 2015, ancher  安康 (676239139@qq.com).
 ** 
 ** This Source Code Form is subject to the terms of the Mozilla Public
 ** License, v. 2.0. If a copy of the MPL was not distributed with this
 ** file, You can obtain one at 
 ** 
 ** 	http://mozilla.org/MPL/2.0/.
 **
 **If it is not possible or desirable to put the notice in a particular
 **file, then You may include the notice in a location (such as a LICENSE
 **file in a relevant directory) where a recipient would be likely to look
 **for such a notice.
 **/
package com.ankang.report.main.handler;



import javax.servlet.http.HttpServletRequest;

import com.ankang.report.model.ReportResponse;
import com.ankang.report.resolver.ReportResolver;

public abstract interface ReportHandler {
	
	ReportResponse handler(String serviceAlias, String methodAlias, ReportResolver resolver, 
			HttpServletRequest request)
			throws Exception;
	
}
