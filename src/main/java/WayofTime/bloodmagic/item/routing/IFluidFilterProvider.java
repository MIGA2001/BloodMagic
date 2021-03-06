package WayofTime.bloodmagic.item.routing;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fluids.capability.IFluidHandler;
import WayofTime.bloodmagic.routing.IFluidFilter;

public interface IFluidFilterProvider extends IRoutingFilterProvider
{
    IFluidFilter getInputFluidFilter(ItemStack stack, TileEntity tile, IFluidHandler handler);

    IFluidFilter getOutputFluidFilter(ItemStack stack, TileEntity tile, IFluidHandler handler);
}
