for(int i = 0; i < m1.rows; i++) { //loops through matrix 1's rows;
                                   
    for(int j = 0; j < m2.columns; j++) { //this loops through matrix 2's columns
        double total = 0; //this holds the total for a single spot

        for(int k = 0; k < m1.columns; k++) { //this loops through each index of numbers required to find the dot product
            double temp = m1.data[i][k] * m2.data[k][j]
            total += temp;
        }

        m3.data[i][j] = total; //adds dot product to apropriate index
    }
}
    
