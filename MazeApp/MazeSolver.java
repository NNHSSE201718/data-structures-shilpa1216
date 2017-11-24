import java.util.ArrayList;
/**
 * Abstract class MazeSolver - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class MazeSolver
{
    // instance variables - replace the example below with your own
    Maze maze = new Maze();
    private boolean isSolved;
    MazeSolver (Maze maze)
    {
        this.maze = maze;
        this.isSolved = false;
        makeEmpty();
        add(maze.getStart());

    }

    abstract void makeEmpty();

    abstract boolean isEmpty();

    abstract void add(Square sq);

    abstract Square next();

    public boolean isSolved()
    {
        if (isEmpty() || isSolved)
        {
            return true;
        }
        else
            return false;
    }

    public String getPath(){
        String s = "";
        s+= maze.getStart().getRow()+maze.getStart().getCol();
        while (!isEmpty())
        {
            s+= "[" + next().getRow() + "," + next().getCol() + "]";
        }
        return s; 
    }

    public Square step()
    {
        if(isEmpty() == false)
        {
            Square sq = next();
            if(sq != null)
            {
                if (sq.getType() == 3)
                {
                    isSolved = true;
                    System.out.print(getPath());
                    return sq;
                }
                else
                {
                    ArrayList<Square> list = maze.getNeighbors(sq);
                    for (Square square : list)
                    {
                        if (!(square.getType() == 1))
                        {
                            list.remove(square);
                        }
                    }

                    for( int i = 0; i < list.size(); i++)
                    {
                        if(list.get(i).getType() != 5)
                        {
                            add(list.get(i));
                            list.get(i).setType(5);
                        }
                        list.get(i).setPrevious(sq);
                    }
                }
                sq.setType(4);
                return sq;
            }
        }
        return null;
    }

    public void solve()
    {
        while(!isSolved())
        {
            step();
        }
        this.isSolved = true;
    }

}
