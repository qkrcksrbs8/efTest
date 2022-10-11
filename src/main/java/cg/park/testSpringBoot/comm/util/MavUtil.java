package cg.park.testSpringBoot.comm.util;

import org.springframework.web.servlet.ModelAndView;

public class MavUtil extends ModelAndView {

    public MavUtil () { super(); }
    public MavUtil (String viewName) {
        super(viewName);
    }

    public MavUtil viewName(String viewName) {
        super.setViewName(viewName);
        return this;
    }

    public MavUtil setObject(String key, Object value)  {
        super.addObject(key, value);
        return this;
    }
}
