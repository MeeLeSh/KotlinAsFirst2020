git clone https://github.com/MeeLeSh/KotlinAsFirst2020.git  
ls  
cd KotlinAsFirst2020  
git init  
git remote add upstream-my https://github.com/MeeLeSh/KotlinAsFirst2021.git  
git fetch upstream-my  
git branch backport  
git checkout backport  
git cherry-pick d535f359...FETCH_HEAD  
resolve conflict: simple.kt chanched  
"fun seconds(hours: Int, minutes: Int, seconds: Int) =  
	hours * 60 * 60 + minutes * 60 + seconds"  
git status   
git add .  
git cherry-pick --continue  
git remote add upstream-theirsto https://github.com/Rudenches/KotlinAsFirst2021.git  
git fetch upstream-theirs  
git checkout master  
git merge backport upstream-theirs/master  
touch remotes  
vi remotes  
ctrl+v  
:wq!  
touch howto.md  
...  
:wq!  
git push -f http://{token}@github.com/MeeLeSh/KotlinAsFirst2020.git master  
