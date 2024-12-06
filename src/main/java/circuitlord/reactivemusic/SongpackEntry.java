package circuitlord.reactivemusic;

import net.minecraft.loot.entry.TagEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.entity.EntityType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongpackEntry {


    // expands out into songpack events, biometag events, and entity events
    public String[] events;

    public boolean alwaysStop = false;

    public boolean alwaysPlay = false;

    public boolean allowFallback = true;

    public String[] songs;

    // Not part of user-facing config, loaded in SongLoader
    public int id = -1;
    public List<SongpackEventType> songpackEvents = new ArrayList<>();
    public List<TagKey<Biome>> biomeTagEvents = new ArrayList<>();
    public List<Map<String, Object>> entityEvents = new ArrayList<>();
    //public List<EntityType<?>> entityEvents = new ArrayList<>();
}
