
package com.fengjx.ttwx.modules.system.controller;

import com.fengjx.ttwx.modules.common.controller.MyController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 系统管理
 *
 * @author fengjx.
 * @date：2015-7-25
 */
@Controller
@RequestMapping("/admin/system")
public class SystemController extends MyController {

    @RequestMapping(value = {
            "", "index"
    })
    public String view() {
        return "system/index";
    }

}
