start runcrud.bat
if "%ERRORLEVEL%" == "0" goto goToChrome
echo runcrud.bat has errors – breaking work
goto fail


:goToChrome
start chrome http://localhost:8080/crud/v1/task/getTasks


:fail
echo.
echo There were errors
