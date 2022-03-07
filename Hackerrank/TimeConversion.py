# Given a time in -hour AM/PM format, convert it to military (24-hour) time.

def timeConversion(s):
    zm = s[-2:]
    
    if zm == "PM" and s[:2] != "12":
        s = str(int(s[:2]) + 12) + s[2:]
    elif zm == "AM" and s[:2] == "12":
        s = "00" + s[2:]
    
    return s[:-2]