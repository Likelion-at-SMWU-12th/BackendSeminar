#1
print('===================')
print('회원가입')
print('===================')

register=False

while not register:
    print('회원가입을 진행하시겠습니까?')
    print('y: 진행      n:취소')
    answer=input('>> ')
    answer=answer.lower() #소문자로 변환
    if answer=='y':
        register=True
        print('===================')
        print('회원가입이 진행됩니다.')
        print('===================')
    elif answer=='n':
        print('===================')
        print('회원가입이 취소됩니다.')
        print('===================')
    else:
        print("'y' 또는 'n'를 입력해주세요. ")
