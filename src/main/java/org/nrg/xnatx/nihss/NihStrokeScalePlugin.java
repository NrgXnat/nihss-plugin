package org.nrg.xnatx.nihss;

import lombok.extern.slf4j.Slf4j;
import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;
import org.nrg.xdat.om.XnatxNihstrokescaledata;

@XnatPlugin(value = "xnatxNihssPlugin", name = "XNATX NIH Stroke Scale Plugin", logConfigurationFile = "nihss-logback.xml",
            dataModels = {@XnatDataModel(value = XnatxNihstrokescaledata.SCHEMA_ELEMENT_NAME,
                                         code = "NIHSS",
                                         singular = "Stroke Scale",
                                         plural = "Stroke Scales")})
@Slf4j
public class NihStrokeScalePlugin {
}
