This is a simple spring boot app so you can easily run it in intellij or you can go to 
https://fanduelapi.herokuapp.com/nba/players to look at the data points. 

Now due to the time frame I was was working under I wasn't able to properly get the date 
endpoints hooked up with the mongo repository. You can see part of my attempt at the branch 
"trying out path" but after about 30-45 minutes of trying to get it to work properly I decided to 
move on to the next challenges.

As far as making this dynamic for different sports one way I'd do this is adding a string property to 
all entities called "sport" so that we could distinguish which object belongs to what sport. I'd then have some 
predefined constant variables "NFL", "NBA", "MLB", etc. Then I'd have all the endpoints have the first route parameter 
as a path parameter annotation on variable called sport and adjust my repositories from there.  