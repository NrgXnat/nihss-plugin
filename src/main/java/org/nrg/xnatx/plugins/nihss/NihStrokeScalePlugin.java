/*
 * nihss-plugin: org.nrg.xnatx.plugins.nihss.NihStrokeScalePlugin
 * XNAT http://www.xnat.org
 * Copyright (c) 2005-2021, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 */

package org.nrg.xnatx.plugins.nihss;

import lombok.extern.slf4j.Slf4j;
import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.om.XnatxNihstrokescaledata;
import org.springframework.context.annotation.Configuration;

@Configuration
@XnatPlugin(value = "xnatxNihssPlugin", name = "XNATX NIH Stroke Scale Plugin", logConfigurationFile = "nihss-logback.xml",
            dataModels = {@XnatDataModel(value = XnatxNihstrokescaledata.SCHEMA_ELEMENT_NAME,
                                         code = "NIHSS",
                                         singular = "Stroke Scale",
                                         plural = "Stroke Scales")})
@Slf4j
public class NihStrokeScalePlugin {
}
