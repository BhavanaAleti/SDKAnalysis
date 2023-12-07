import pandas as pd
import matplotlib.pyplot as plt
import glob
import os
data = []
path = os.getcwd()+"/go_output"
csv_files = glob.glob(os.path.join(path, "*.csv"))
for f in csv_files:

    # read the csv file
    df = pd.read_csv(f)
    data_list = df[' Count'].tolist()
    sum_list = sum(data_list)
    for i in range(0, len(data_list)):
        data_list[i] = data_list[i]*100 / sum_list
    data_list.insert(0, f.split("/")[-1].split(".")[0])
    data.append(data_list)

finaldf = pd.DataFrame(data, columns=['SDKs',
                                      'UnSafeCriticalFields',
                                      'UnSafeCriticalMethods',
                                      'UnSafeCriticalVariables',
                                      'SafeCriticalFields',
                                      'SafeCriticalMethods',
                                      'SafeCriticalVariables'])

finaldf.plot(x='SDKs',
             kind='bar',
             stacked=True,
             title='GoLang SDKs')
plt.xticks(rotation=0, ha='center')
plt.show()

data = []
path = os.getcwd()+"/java_output"
csv_files = glob.glob(os.path.join(path, "*.csv"))
for f in csv_files:

    # read the csv file
    df = pd.read_csv(f)
    data_list = df[' Count'].tolist()
    sum_list = sum(data_list)
    for i in range(0, len(data_list)):
        data_list[i] = data_list[i]*100 / sum_list
    data_list.insert(0, f.split("/")[-1].split(".")[0])
    data.append(data_list)

finaldfJava = pd.DataFrame(data, columns=['SDKs',
                                          'UnSafeCriticalFields',
                                          'UnSafeCriticalMethods',
                                          'UnSafeCriticalVariables',
                                          'SafeCriticalFields',
                                          'SafeCriticalMethods',
                                          'SafeCriticalVariables'])

finaldfJava.plot(x='SDKs',
                 kind='bar',
                 stacked=True,
                 title='JAVA SDKs')
plt.xticks(rotation=0, ha='center')
plt.show()