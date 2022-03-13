import requests
from bs4 import BeautifulSoup
data = requests.get('https://www.rajagiritech.ac.in/Home/exam/BTech_Curriculum.asp')
soup = BeautifulSoup(data.content, 'html.parser')
answer = ""
for curriculum in soup.find_all(class_='extra-wrap'):
    for link in curriculum.find_all('li'):
        a = link.find('a')
        answer += (('''<a href = "https://www.rajagiritech.ac.in/Home/exam/''' + a['href']) + '''">'''
                   + a.get_text() + "</a>" + "\n")
print(answer)
