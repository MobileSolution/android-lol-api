package com.mobilesolutions.lolapi.models.matchhistory;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class ParticipantStats implements Serializable {

    @Expose
    private long assists;
    @Expose
    private long champLevel;
    @Expose
    private long combatPlayerScore;
    @Expose
    private long deaths;
    @Expose
    private long doubleKills;
    @Expose
    private boolean firstBloodAssist;
    @Expose
    private boolean firstBloodKill;
    @Expose
    private boolean firstInhibitorAssist;
    @Expose
    private boolean firstInhibitorKill;
    @Expose
    private boolean firstTowerAssist;
    @Expose
    private boolean firstTowerKill;
    @Expose
    private long goldEarned;
    @Expose
    private long goldSpent;
    @Expose
    private long inhibitorKills;
    @Expose
    private long item0;
    @Expose
    private long item1;
    @Expose
    private long item2;
    @Expose
    private long item3;
    @Expose
    private long item4;
    @Expose
    private long item5;
    @Expose
    private long item6;
    @Expose
    private long killingSprees;
    @Expose
    private long kills;
    @Expose
    private long largestCriticalStrike;
    @Expose
    private long largestKillingSpree;
    @Expose
    private long largestMultiKill;
    @Expose
    private long magicDamageDealt;
    @Expose
    private long magicDamageDealtToChampions;
    @Expose
    private long magicDamageTaken;
    @Expose
    private long minionsKilled;
    @Expose
    private long neutralMinionsKilled;
    @Expose
    private long neutralMinionsKilledEnemyJungle;
    @Expose
    private long neutralMinionsKilledTeamJungle;
    @Expose
    private long nodeCapture;
    @Expose
    private long nodeCaptureAssist;
    @Expose
    private long nodeNeutralize;
    @Expose
    private long nodeNeutralizeAssist;
    @Expose
    private long objectivePlayerScore;
    @Expose
    private long pentaKills;
    @Expose
    private long physicalDamageDealt;
    @Expose
    private long physicalDamageDealtToChampions;
    @Expose
    private long physicalDamageTaken;
    @Expose
    private long quadraKills;
    @Expose
    private long sightWardsBoughtInGame;
    @Expose
    private long teamObjective;
    @Expose
    private long totalDamageDealt;
    @Expose
    private long totalDamageDealtToChampions;
    @Expose
    private long totalDamageTaken;
    @Expose
    private long totalHeal;
    @Expose
    private long totalPlayerScore;
    @Expose
    private long totalScoreRank;
    @Expose
    private long totalTimeCrowdControlDealt;
    @Expose
    private long totalUnitsHealed;
    @Expose
    private long towerKills;
    @Expose
    private long tripleKills;
    @Expose
    private long trueDamageDealt;
    @Expose
    private long trueDamageDealtToChampions;
    @Expose
    private long trueDamageTaken;
    @Expose
    private long unrealKills;
    @Expose
    private long visionWardsBoughtInGame;
    @Expose
    private long wardsKilled;
    @Expose
    private long wardsPlaced;
    @Expose
    private boolean winner;

    public long getAssists() {
        return assists;
    }

    public long getChampLevel() {
        return champLevel;
    }

    public long getCombatPlayerScore() {
        return combatPlayerScore;
    }

    public long getDeaths() {
        return deaths;
    }

    public long getDoubleKills() {
        return doubleKills;
    }

    public boolean isFirstBloodAssist() {
        return firstBloodAssist;
    }

    public boolean isFirstBloodKill() {
        return firstBloodKill;
    }

    public boolean isFirstInhibitorAssist() {
        return firstInhibitorAssist;
    }

    public boolean isFirstInhibitorKill() {
        return firstInhibitorKill;
    }

    public boolean isFirstTowerAssist() {
        return firstTowerAssist;
    }

    public boolean isFirstTowerKill() {
        return firstTowerKill;
    }

    public long getGoldEarned() {
        return goldEarned;
    }

    public long getGoldSpent() {
        return goldSpent;
    }

    public long getInhibitorKills() {
        return inhibitorKills;
    }

    public long getItem0() {
        return item0;
    }

    public long getItem1() {
        return item1;
    }

    public long getItem2() {
        return item2;
    }

    public long getItem3() {
        return item3;
    }

    public long getItem4() {
        return item4;
    }

    public long getItem5() {
        return item5;
    }

    public long getItem6() {
        return item6;
    }

    public long getKillingSprees() {
        return killingSprees;
    }

    public long getKills() {
        return kills;
    }

    public long getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    public long getLargestKillingSpree() {
        return largestKillingSpree;
    }

    public long getLargestMultiKill() {
        return largestMultiKill;
    }

    public long getMagicDamageDealt() {
        return magicDamageDealt;
    }

    public long getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    public long getMagicDamageTaken() {
        return magicDamageTaken;
    }

    public long getMinionsKilled() {
        return minionsKilled;
    }

    public long getNeutralMinionsKilled() {
        return neutralMinionsKilled;
    }

    public long getNeutralMinionsKilledEnemyJungle() {
        return neutralMinionsKilledEnemyJungle;
    }

    public long getNeutralMinionsKilledTeamJungle() {
        return neutralMinionsKilledTeamJungle;
    }

    public long getNodeCapture() {
        return nodeCapture;
    }

    public long getNodeCaptureAssist() {
        return nodeCaptureAssist;
    }

    public long getNodeNeutralize() {
        return nodeNeutralize;
    }

    public long getNodeNeutralizeAssist() {
        return nodeNeutralizeAssist;
    }

    public long getObjectivePlayerScore() {
        return objectivePlayerScore;
    }

    public long getPentaKills() {
        return pentaKills;
    }

    public long getPhysicalDamageDealt() {
        return physicalDamageDealt;
    }

    public long getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    public long getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    public long getQuadraKills() {
        return quadraKills;
    }

    public long getSightWardsBoughtInGame() {
        return sightWardsBoughtInGame;
    }

    public long getTeamObjective() {
        return teamObjective;
    }

    public long getTotalDamageDealt() {
        return totalDamageDealt;
    }

    public long getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    public long getTotalDamageTaken() {
        return totalDamageTaken;
    }

    public long getTotalHeal() {
        return totalHeal;
    }

    public long getTotalPlayerScore() {
        return totalPlayerScore;
    }

    public long getTotalScoreRank() {
        return totalScoreRank;
    }

    public long getTotalTimeCrowdControlDealt() {
        return totalTimeCrowdControlDealt;
    }

    public long getTotalUnitsHealed() {
        return totalUnitsHealed;
    }

    public long getTowerKills() {
        return towerKills;
    }

    public long getTripleKills() {
        return tripleKills;
    }

    public long getTrueDamageDealt() {
        return trueDamageDealt;
    }

    public long getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    public long getTrueDamageTaken() {
        return trueDamageTaken;
    }

    public long getUnrealKills() {
        return unrealKills;
    }

    public long getVisionWardsBoughtInGame() {
        return visionWardsBoughtInGame;
    }

    public long getWardsKilled() {
        return wardsKilled;
    }

    public long getWardsPlaced() {
        return wardsPlaced;
    }

    public boolean isWinner() {
        return winner;
    }
}
