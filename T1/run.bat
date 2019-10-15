echo off
cls
echo "Compiling.... "
javac Task1.java

echo =====================================================
echo "Running with n=5"
java Task1 5

echo =====================================================
echo "Running with n=20"
java Task1  20

echo =====================================================
echo "Running with n=100"
java Task1 100

echo =====================================================
echo "Running with n=1000"
java Task1 1000

echo =====================================================
echo "Running with n=10000"
java Task1 10000

echo =====================================================
echo "Running with n=100000"
java Task1 100000

echo =====================================================
pause