const express = require("express");
const router = express.Router();
const Employee = require("../models/employ");

//   line 8-13 we are doing api not connecting with mongoDb
/* router.get("/", (req, res) => {
  res.status(200).json({
    error: false,
    message: "get all employees"
  });
}); */

router.get("/", async (req, res) => {
  const employee = await Employee.find();
  try {
    res.status(201).json({
      error: false,
      data: employee
    });
  } catch (error) {
    res.status(400).json({
      error: true,
      message: error.message
    });
  }
});

/* router.get("/:id", (req, res) => {
  let id = req.params.id;
  res.json("Student Id:" + id);
  res.status(200).json({
    error: false,
    message: "get all employees"
  });
});
 */

router.get("/:id", async (req, res) => {
  const employee = await Employee.findById(req.params.id);
  if (!employee) {
    res.status(404).json({
      error: true,
      message: "employee id doesn't exist"
    });
  }
  try {
    res.status(201).json({
      error: false,
      message: employee
    });
  } catch (error) {
    res.status(401).json({
      error: true,
      message: error.message
    });
  }
});

// line 37-43 , we are doing api not connecting with mongoDb, just for creating post api
/* router.post("/", (req, res) => {
    res.status(201).json({
      error: false,
      message: "creating an employee api"
    });
  });
 */

// line 48-63 code for api as well as with mongoDb
router.post("/", async (req, res) => {
  const emp = req.body; // important line
  const emp1 = await Employee.create(emp);

  try {
    res.status(201).json({
      error: false,
      data: emp1
    });
  } catch (error) {
    res.status(400).json({
      error: false,
      message: error.message
    });
  }
});

/* 
router.put("/", (req, res) => {
  res.status(200).json({
    error: false,
    message: " update an employee api"
  });
}); */

router.put("/:id", async (req, res) => {
  const employee = await Employee.findByIdAndUpdate(req.params.id);
  if (!employee) {
    res.status(404).json({
      error: true,
      message:  "employee id doesn't exist"
    });
  }
  try {
    res.status(201).json({
      error: false,
      message: employee
    });
  } catch (error) {
    res.status(401).json({
      error: true,
      message: error.message
    });
  }
});

/* router.delete("/", (req, res) => {
  res.status(200).json({
    error: false,
    message: " delete an employee api"
  });
});
 */
router.delete("/:id", async (req, res) => {
  const employee = await Employee.findByIdAndDelete(req.params.id);
  if (!employee) {
    res.status(404).json({
      error: true,
      message:  "employee id doesn't exist"
    });
  }
  try {
    res.status(201).json({
      error: false,
      message: "employee deleted successfully"
    });
  } catch (error) {
    res.status(401).json({
      error: true,
      message: error.message
    });
  }
});


module.exports = router;
