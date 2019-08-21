#Calculating the gravitational force and acceleration due to gravity

radius_int = 6378 * (10**3) #in meters

#Earth's mass
earth_mass_float = 5.9742 * (10**24) #in Kg

#Prompt the user to input the value of Mr. Jones mass in Kg

X_int = int(input("Input the mass of Mr. Jones: "))


#Gravitational constant

gravitational_constant = 6.67300 * (10**-11) #(m3kg-1s-2)

#To calculate the gravitational Force:
gravitational_force = (gravitational_constant * (earth_mass_float) * (X_int)) / radius_int**2

# To calculate the acceleration due to gravity

g_float = gravitational_force / X_int

print("Acceleration due to gravity: ",g_float,"m/s2")
print("Gravitational Force",gravitational_force,"N")



