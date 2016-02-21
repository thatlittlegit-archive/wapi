echo "Checking all programs are existant..."
nodever=`node --version`
javaver=`java -version 2>&1 | head -n 1 | awk -F '"' '{print $2}'`
echo "Node.js version $nodever"
echo "Java version $javaver"
echo "Done!"