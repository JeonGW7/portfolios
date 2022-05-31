#N개의 최소공배수
def GCD(x,y): 
    while(True):
        if y==0:
            break
        x,y = y,x%y
    return x
def LCM(x,y): 
    return x*y//GCD(x,y)

def solution(arr):
    while True:
        arr.append(LCM(arr.pop(),arr.pop()))
        if len(arr)==1:
            return arr[0]
