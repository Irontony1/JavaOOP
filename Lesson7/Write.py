from os.path import exists
from CreatingHead import CreatingHead
from UserInput import UserInput


class Write(CreatingHead, UserInput):
    ch = CreatingHead()
    ui = UserInput()

    def txt_write(self):
        path = 'txt_PhoneBook.txt'
        valid = exists(path)
        if valid != True: self.ch.creating_head()

        data = self.ui.get_info()
        with open(path, 'a', encoding='utf-8') as file:
            file.write(f'{data[0]};{data[1]};{data[2]}\n')

