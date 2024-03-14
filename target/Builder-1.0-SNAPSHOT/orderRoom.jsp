<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Room Order</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h2>Order Your Room</h2>
        <form action="orderRoom" method="post">
            <div class="form-group">
                <label for="numberOfBeds">Number of beds:</label>
                <select class="form-control" id="numberOfBeds" name="numberOfBeds">
                    <option>Single</option>
                    <option>Double</option>
                    <option>Triple</option>
                </select>
            </div>
            <div class="form-group">
                <label for="view">View:</label>
                <select class="form-control" id="view" name="view">
                    <option>Sea</option>
                    <option>Pool</option>
                </select>
            </div>
            <div class="form-group">
                <label for="type">Room Type:</label>
                <select class="form-control" id="type" name="type">
                    <option>Regular</option>
                    <option>Suite</option>
                </select>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</body>
</html>