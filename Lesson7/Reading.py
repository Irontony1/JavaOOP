import os
from os.path import exists
from CreatingHead import CreatingHead
from style_xlsx import Style
from openpyxl import Workbook
import webbrowser


class Reading(Style, CreatingHead):
    ch = CreatingHead()
    styling = Style()

    def open_xlsx(self):

        path = 'txt_PhoneBook.txt'

        valid = exists(path)
        data_row = []
        if valid != True:
            self.ch.creating_head()
        else:
            with open(path, 'r', encoding='utf-8') as file:
                for line in file:
                    data_row.append(line.strip())
        wb = Workbook()
        ws = wb.active
        for item in data_row:
            ws.append(item.split(';'))

        wb.save('PhoneBook.xlsx')
        self.styling.styling()
        #excel.exe
        osCommandString = f'xdg-open /home/georgii/Загрузки/PhoneBook/PhoneBook.xlsx'
        os.system(osCommandString)

    def open_html(self):
        path = 'txt_PhoneBook.txt'
        valid = exists(path)
        if valid != True:
            self.ch.creating_head()
        else:
            with open(path, 'r', encoding='utf-8') as firstfile, open('PhoneBook.html', 'w',
                                                                      encoding='utf-8') as secondfile:
                for ln in firstfile:
                    a = ln.split(';')
                    style = 'style="font-size:30px;"'
                    html = '<html>  <head></head>  <body>'
                    html += '<p {}>{} {} {}</p>'.format(style, a[0], a[1], a[2])
                    html += '</body></html>'
                    print(html)
                    secondfile.write(html)
        webbrowser.open_new_tab('PhoneBook.html')
