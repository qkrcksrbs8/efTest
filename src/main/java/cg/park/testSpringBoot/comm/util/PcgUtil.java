package cg.park.testSpringBoot.comm.util;

import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class PcgUtil {

    public boolean isMapEmpty (final Map<?, ?> map) { return map == null || map.isEmpty(); }

}
