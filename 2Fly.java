private static void cancelBooking() {
        if (currentReservation == null) {
        System.out.println("No booking found to cancel.");
        return;
        }
        while (true) {
            System.out.print("Are you sure you want to cancel the booking? (yes/no): ");
            String confirmation = scanner.nextLine().toLowerCase().trim();
            switch (confirmation) {
                case "yes":
                    seatManager seat = currentReservation.getSeats();
                    if (seat != null) {
                        seat.bookingCancelled();
                        currentReservation = null;
                        System.out.println("Booking cancelled successfully.");
                    } else {
                        System.out.println("Seat info not found. Cannot cancel booking properly.");
                    } return;
                case "no":
                    System.out.println("Cancellation aborted.");
                    return;
                default:
                    System.out.println("Invalid input. Please type 'yes' or 'no'.");
                    break;
            }
        }
    }
