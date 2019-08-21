# To calculate the Passer rating

pass_completion = int(input("Pass Completion: "))

pass_attempt = int(input("Pass Attempt: "))

total_passing_yards = int(input("Total passing yards: "))

touchdowns = int(input("Touch downs: "))

interceptions = int(input("Interceptions: "))

# Calculating for each
# where C - Completions per attempt
# Y - Yards per attempt
# T - Touchdowns per attempt
# I - Interceptions per attempt

C = ((pass_completion / pass_attempt * 100) - 30) / 20
Y = ((total_passing_yards / pass_attempt) - 3) / 4
T = (touchdowns / pass_attempt) * 20
I = 2.375 - (interceptions / pass_attempt * 35)

pass_rating = ((C + Y + T + I) / 6) * 100

print("passer rating: ",pass_rating)


