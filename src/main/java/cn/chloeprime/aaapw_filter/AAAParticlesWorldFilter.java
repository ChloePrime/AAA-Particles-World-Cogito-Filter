package cn.chloeprime.aaapw_filter;

import cn.chloeprime.aaapw_filter.common.AAAPWF;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(AAAParticlesWorldFilter.MOD_ID)
public class AAAParticlesWorldFilter {
    public static final String MOD_ID = "aaapw_filter";

    public AAAParticlesWorldFilter(IEventBus modbus) {
        AAAPWF.init(modbus);
    }
}
