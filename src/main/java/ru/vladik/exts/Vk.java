package ru.vladik.exts;

import com.sedmelluq.discord.lavaplayer.player.AudioPlayerManager;
import com.sedmelluq.discord.lavaplayer.source.AudioSourceManager;
import com.sedmelluq.discord.lavaplayer.track.AudioItem;
import com.sedmelluq.discord.lavaplayer.track.AudioReference;
import com.sedmelluq.discord.lavaplayer.track.AudioTrack;
import com.sedmelluq.discord.lavaplayer.track.AudioTrackInfo;
import dev.arbjerg.lavalink.api.ISocketContext;
import dev.arbjerg.lavalink.api.WebSocketExtension;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

@Service
public class Vk implements WebSocketExtension {
    @Override
    public String getOpName() {
        return null;
    }

    @Override
    public void onInvocation(ISocketContext context, JSONObject message) {
    }
}
