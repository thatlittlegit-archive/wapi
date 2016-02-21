u="\033[u"
echo "---[wapidstyle's CI tools]---"
nodever=`node --version`
npmver=`npm -v`
javaver=`java -version 2>&1 | head -n 1 | awk -F '"' '{print $2}'`
gradlever=`gradle -v | head -n 3 | tail -n 1 | cut -d " " -f2`
echo "Running Node.js $nodever with npm $npmver, Java version $javaver and Gradle $gradlever"
echo "Preparing to install modules. To stop now, press Ctrl+C."
eval echo -ne 'Beginning in 5$u'
sleep 1
eval echo -ne 'Beginning in 4$u'
sleep 1
eval echo -ne 'Beginning in 3$u'
sleep 1
eval echo -ne 'Beginning in 2$u'
sleep 1
eval echo -ne 'Beginning in 1$u'
sleep 1
eval echo -ne 'Beginning    0$u'
#npm install htmlhint csslint jshint jscs
echo Done installing modules.