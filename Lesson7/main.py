from Write import Write
from Reading import Reading


def main_run():
    reading = Reading()
    writing = Write()
    total_command = input('Выберите команду: \n'
                          '1. Добавить контакт \n'
                          '2. Посмотреть контакты xls \n'
                          '3. Посмотреть контакты html \n')

    match total_command.split():
        case ["1"]:
            writing.txt_write()
        case ["2"]:
            reading.open_xlsx()
        case ["3"]:
            reading.open_html()
        case _:
            print("Нет такой команды")


main_run()
