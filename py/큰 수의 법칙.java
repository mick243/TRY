n, m, k = map(int, input().split())
data = list(map(int, input().split)))

data.sort() // 입력받은 수들 정렬
first = data[n-1] // 가장 큰 수
second = data[n-2] // 2번째
result = 0

while True:
  for i in range(k): // 가장 큰 수 k번 더하기
    if m == 0: // m이 0이라면 반복문 탈출
      break
    result += first
    m -= 1 // 더할 때마다 1씩 빼기
  if m == 0: // m이 0이라면 반복문 탈출
    break
  result += second
  m -= 1
  
print(result)

//
n, m, k = map(int, input().split())
data = list(map(int, input().split)))

data.sort() 
first = data[n-1] 
second = data[n-2] 

count = int(m / (k+1)) * k
count += m % (k + 1)

result = 0
result += (count) * first
result += (m - count) * second

print(result)
//
