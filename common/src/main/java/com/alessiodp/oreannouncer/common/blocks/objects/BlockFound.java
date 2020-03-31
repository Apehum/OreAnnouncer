package com.alessiodp.oreannouncer.common.blocks.objects;

import com.alessiodp.oreannouncer.api.interfaces.OABlock;
import com.alessiodp.oreannouncer.api.interfaces.OABlockFound;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@EqualsAndHashCode
public class BlockFound implements OABlockFound {
	@Getter private final UUID player;
	@Getter private final String materialName;
	@Getter private final long timestamp;
	@Getter private int found;
	
	public BlockFound(UUID player, OABlock block, int found) {
		this(player, block, System.currentTimeMillis() / 1000, found);
	}
	
	public BlockFound(UUID player, OABlock block, long timestamp, int found) {
		this(player, block.getMaterialName().toUpperCase(), timestamp, found);
	}
}