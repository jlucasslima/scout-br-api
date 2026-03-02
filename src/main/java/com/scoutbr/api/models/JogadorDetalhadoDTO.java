package com.scoutbr.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JogadorDetalhadoDTO {
    @JsonProperty("player_image") private String player_image;
    @JsonProperty("player_name") private String player_name;
    @JsonProperty("team_name") private String team_name;
    @JsonProperty("player_type") private String player_type;
    @JsonProperty("player_age") private String player_age;
    @JsonProperty("player_match_played") private String player_match_played;
    @JsonProperty("player_goals") private String player_goals;
    @JsonProperty("player_assists") private String player_assists;
    @JsonProperty("player_rating") private String player_rating;
    @JsonProperty("player_passes_accuracy") private String player_passes_accuracy;
    @JsonProperty("player_shots_total") private String player_shots_total;

    // Getters
    public String getPlayer_image() { return player_image; }
    public String getPlayer_name() { return player_name; }
    public String getTeam_name() { return team_name; }
    public String getPlayer_type() { return player_type; }
    public String getPlayer_age() { return player_age; }
    public String getPlayer_match_played() { return player_match_played; }
    public String getPlayer_goals() { return player_goals; }
    public String getPlayer_assists() { return player_assists; }
    public String getPlayer_rating() { return player_rating; }
    public String getPlayer_passes_accuracy() { return player_passes_accuracy; }
    public String getPlayer_shots_total() { return player_shots_total; }
}