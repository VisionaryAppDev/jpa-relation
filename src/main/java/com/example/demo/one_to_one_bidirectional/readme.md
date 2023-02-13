In a one-to-one bidirectional relationship, the owner side of the relationship, i.e. the side that holds the foreign key, should be annotated with the @JoinColumn annotation.

In this example, the Address entity should annotate with @JoinColumn as the employee_id column in the Address table is used to establish the relationship with the Employee entity.
