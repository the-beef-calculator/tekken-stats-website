package org.tekkenstats.interfaces;

public interface PopularCharacterProjection {
    String getRegionId();
    String getCharacterId();
    Long getTotalWins();
    Long getTotalLosses();
    Long getTotalBattles();
    Double getWinratePercentage();
}
