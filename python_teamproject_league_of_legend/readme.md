# 2022-Big Data_teamporject
# League of Legends 포지션별 승률 분석 및 승률에 영향을 끼치는 요소 확인

#### Project execution period : 2022.05.04~2022.05.10

-----------------------
## 프로젝트 목표

- 로지스틱 회귀 분석 및 의사 결정 트리를 사용하여 포지션 별 LOL게임결과 예측
- Big Data 처리 경험 및 머신 러닝 경험 
- 학습내용 재정리 및 적용
- 팀 프로젝트를 통한 의사소통 방법과 팀워크 단련

## 개발 환경
- OS: window10
- 개발 툴: colab, jupyter notebook
- 개발 언어: Python
- 사용 라이브러리 : sklearn(싸이킷런), plotly(플로틀리)

## 프로젝트 주제 및 선정 배경
- 평소 즐겨 하는 게임을 주제로 선정해서 프로젝트를 진행해 보고 싶었다

## 2022년 1월 챌린저(최상위권) 랭크 게임 데이터를 기반으로 수행
- 데이터를 각 포지션 별로 나누어 수행

## 기대효과
- 게임 내 지표를 기반으로 승률을 예측할 수 있게 되고 어느 지표가 승률에 가장 영향을 끼치는지를 알 수 있다

## 담당 업무
- 자료 조사 및 데이터 정제, 데이터 시각화

## 수행 결과
<details>
    <summary>자세히</summary>

1. 데이터 프레임 생성
    
![데이터 프레임](https://user-images.githubusercontent.com/86759846/175320451-ea0282f3-1092-4fbc-bf69-9a693989bb5f.PNG)
  
2. 포지션 별 챔피언 선택 분포 시각화

![캡처2](https://user-images.githubusercontent.com/86759846/175320111-816917a6-c328-421c-993e-a9ba9b3560ca.PNG)

3. 데이터 정제(승률 분석에 필요한 column만 남김)
    
![데이터 정제](https://user-images.githubusercontent.com/86759846/175320676-70ec1b1c-0040-4a4a-ad3c-74ba2c6c61b6.PNG)

4. 분석 방법
    
![분석방법](https://user-images.githubusercontent.com/86759846/175320825-963d2c6e-94a5-4965-8b38-776d02dd52a4.PNG)

5. 포지션 별 분석 (대표적으로 탑 포지션만 캡처, 각 과정 반복)
    
![탑_분석1](https://user-images.githubusercontent.com/86759846/175321175-d2560819-57a0-401a-9126-ccd06dbd4edc.PNG)
![탑_분석2](https://user-images.githubusercontent.com/86759846/175321358-3739fb67-904d-48fe-acc1-520796e3ec30.PNG)
![탑_분석3](https://user-images.githubusercontent.com/86759846/175321511-4b458b25-3c6c-4672-922b-7437f445d95d.PNG)
![탑_분석4](https://user-images.githubusercontent.com/86759846/175321632-dd5467e2-481a-407d-a82a-61faccf745f1.PNG)
  
6. 분석 결과
    
Random Forest모델과 Decision Tree모델은  KDA에 중점을 두었고, 
로지스틱 회귀 모델은 total_minions_killed에 중점으로 두었다는 것을 볼 수 있다.

7. 전체 결과

![전체결과_1](https://user-images.githubusercontent.com/86759846/175321984-a637bea6-cbdf-4001-99c9-356967f5bbdc.PNG)
![전체결과_2](https://user-images.githubusercontent.com/86759846/175322107-a9ac246b-3dc2-44c7-825f-1a3259cb1126.PNG)
  
</details>
