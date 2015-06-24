# android-lol-api
Android application related to League of Legends

[![jitpack](https://img.shields.io/github/release/MobileSolution/android-lol-api.svg?label=JitPack)](https://jitpack.io/#MobileSolution/android-lol-api/v0.0.2)

##Usage
In Application.onCreate()

         LolApi.init(apiKey);
         LolApi.setRegion("eune");

Then
Sync

         final Champions championDtos = LolApi.getChampions();

Async

         LolApi.getChampions(callback);

Rx

         final Observable<Champions> championsRx = LolApi.getChampionsRx();

## List of api versions
[https://developer.riotgames.com/api/methods](https://developer.riotgames.com/api/methods)

 * champion-v1.2
 * current-game-v1.0 
 * featured-games-v1.0
 * game-v1.3
 * league-v2.5
 * lol-static-data-v1.2
 * lol-status-v1.0
 * match-v2.2
 * matchhistory-v2.2
 * stats-v1.3
 * summoner-v1.4
 * team-v2.4

##### Download

	repositories {
	    maven {
	        url "https://jitpack.io"
	    }
	}

	dependencies {
	        compile 'com.github.MobileSolution:android-lol-api:v0.1'
	}

## Licence

     Copyright 2015 Georgi Eftimov

     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.
